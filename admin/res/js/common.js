//表单json化
(function($){
    $.fn.serializeJson=function(){
        var serializeObj={};
        $(this.serializeArray()).each(function(){
            if(this.value != ""){
                serializeObj[this.name]=this.value;
            }
        });
        return serializeObj;
    };
})(jQuery);

//表格渲染共通参数
var baseRenderParams = {
    elem: '#table',
    toolbar: '#toolbar',
    method:'post',
    parseData: function(res){ //res 即为原始返回的数据
        return {
            "code": res.status, //解析接口状态
            "msg": res.msg, //解析提示文本
            "count": res.data.total, //解析数据长度
            "data": res.data.list //解析数据列表
        };
    },
    request: {
        pageName: 'pageNum',
        limitName: 'pageSize'
    },
    page: true,
    limits: [20, 40, 60, 80],
    limit: 20
}

//loadling通用参数
var commonLoadingParam = {shade: [0.3,'#333']}

layui.use(['form'], function(){
    layui.form.verify({
        length4: function(value){
            if(value.length > 4){
                return '字段长度不能超过4个';
            }
        }
        ,length32: function(value){
            if(value.length > 32){
                return '字段长度不能超过32个';
            }
        }
        ,length64: function(value){
            if(value.length > 64){
                return '字段长度不能超过64个';
            }
        }
        ,length255: function(value){
            if(value.length > 255){
                return '字段长度不能超过255个';
            }
        }
        ,length1024: function(value){
            if(value.length > 1024){
                return '字段长度不能超过1024个';
            }
        }
        ,length2048: function(value){
            if(value.length > 2048){
                return '字段长度不能超过2048个';
            }
        }
        ,number: function(value){
            if(value.length > 1 && !value.match("^[1-9]\\d*$")){
                return '只能填写数字';
            }
        }
        ,cardid: function(value){
            if(value.length > 1 && !value.match("(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)")){
                return '身份证格式不正确';
            }
        }
        ,bankCardNo: function(value){
            if(value.length > 1 && !value.match("^[0-9]{1,37}$")){
                return '银行卡格式不正确';
            }
        }
        ,mobile: function(value){
            if(value.length > 1 && !value.match("^1\\d{10}$")){
                return '手机号格式不正确';
            }
        }
        ,email: function(value){
            if(value.length > 1 && !value.match("^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$")){
                return '邮箱式不正确';
            }
        }

    });
});
// 缓存当前操作的是哪个表格的哪个tr的哪个td
$(document).off('mousedown', '.layui-table-grid-down')
    .on('mousedown', '.layui-table-grid-down', function (event) {
        // 记录操作的td的jquery对象
        table._tableTdCurr = $(this).closest('td');
    });

// 给弹出的详情里面的按钮添加监听级联的触发原始table的按钮的点击事件
$(document).off('click', '.layui-table-tips-main [lay-event]')
    .on('click', '.layui-table-tips-main [lay-event]', function (event) {
        var elem = $(this);
        var tableTrCurr = table._tableTdCurr;
        if (!tableTrCurr) {
            return;
        }
        var layerIndex = elem.closest('.layui-table-tips').attr('times');
        // 关闭当前的这个显示更多的tip
        layer.close(layerIndex);
        // 找到记录的当前操作的那个按钮
        table._tableTdCurr.find('[lay-event="' + elem.attr('lay-event') + '"]').first().click();
    });