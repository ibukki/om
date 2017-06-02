var viewData = {
	order: {
		mileage:"5000",
		maintainType:"Small Maintenance",
		
		totalAmount:"1",
		inshopDate:"2017-01-01",
		checkoutDate:"",
		comment:"fix it"
	},
	user:{
		userName:"Ryan Huang",
		mobile:"13761202697"
	},
	car: {
		carModel:"Infinite",
		licenseNumber:"沪BPF980"
	},
	disableSubmitButton:false
}

var vm = new Vue({
	el:"#content",
	data:viewData,
	methods:{
		submitOrder: function(){
			if(this.validate()){
				this.saveOrder();
			}
		},
		
		saveOrder: function(){
			var that = this;
			if(this.order.inshopDate && !this.order.checkoutDate){
				this.order.checkoutDate = this.order.inshopDate;
			}
			$.ajax({
				url:"morder/save",
				method:"POST",
				data:JSON.stringify({order:this.order, user:this.user, car: this.car}),
				dataType:"json",
				contentType:"application/json",
				success:function(data){
					alert("Order Saved");
					that.disableSubmitButton = true;
				},
				error:function(error){
					
				}
			})
		},
		validate: function(){
			var passed = true;
			if(!this.car.carModel){
				passed = false;
				return;
			}
			if(!this.car.licenseNumber){
				passed = false;
				return;
			}
			if(!this.order.maintainType){
				passed = false;
				return;
			}
			if(!this.order.totalAmount){
				passed = false;
				return;
			}
			return passed;
		}
	}
});

$("#inshopDatePicker").datetimepicker({
    locale: 'zh-CN',
    weekStart: 1,
    todayBtn:  1,
	autoclose: 1,
	todayHighlight: 1,
	pickerPosition:"bottom-left",
	startView: 2,
	minView: 2,
	forceParse: 0,
	format:'yyyy-MM-dd',
}).on("changeDate",function(evt){
	var date = evt.date;
	vm.order.inshopDate = new Date(date).format("yyyy-MM-dd");
});

$("#checkoutDatePicker").datetimepicker({
    locale: 'zh-CN',
    weekStart: 1,
    todayBtn:  1,
	autoclose: 1,
	todayHighlight: 1,
	pickerPosition:"bottom-left",
	startView: 2,
	minView: 2,
	forceParse: 0,
	format:'yyyy-MM-dd'
}).on("changeDate",function(evt){
	var date = evt.date;
	vm.order.checkoutDate = new Date(date).format("yyyy-MM-dd");
});


/** 
 * 时间对象的格式化; 
 */  
Date.prototype.format = function(format) {  
    /* 
     * 使用例子:format="yyyy-MM-dd hh:mm:ss"; 
     */  
    var o = {  
        "M+" : this.getMonth() + 1, // month  
        "d+" : this.getDate(), // day  
        "h+" : this.getHours(), // hour  
        "m+" : this.getMinutes(), // minute  
        "s+" : this.getSeconds(), // second  
        "q+" : Math.floor((this.getMonth() + 3) / 3), // quarter  
        "S" : this.getMilliseconds()  
        // millisecond  
    }  
    
    if (/(y+)/.test(format)) {  
        format = format.replace(RegExp.$1, (this.getFullYear() + "").substr(4  
                        - RegExp.$1.length));  
    }  
    
    for (var k in o) {  
        if (new RegExp("(" + k + ")").test(format)) {  
            format = format.replace(RegExp.$1, RegExp.$1.length == 1  
                            ? o[k]  
                            : ("00" + o[k]).substr(("" + o[k]).length));  
        }  
    }  
    return format;  
}