var viewData = {
	order: {
		carModel:"Infinite",
		licenseNumber:"沪BPF980",
		mileage:"5000",
		owner:"Ryan Huang",
		maintainType:"Maintenance",
		phone:"13761202697",
		totalAmount:"1",
		inshopDate:"2017/01/01",
		checkoutDate:"",
		comment:"fix it"
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
			$.ajax({
				url:"morder/save",
				method:"POST",
				data:JSON.stringify({order:this.order}),
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
			if(!this.order.carModel){
				passed = false;
				return;
			}
			if(!this.order.licenseNumber){
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
	format:'yyyy/mm/dd'
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
	format:'yyyy/mm/dd'
});