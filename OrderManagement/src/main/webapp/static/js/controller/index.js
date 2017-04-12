var viewData = {
	carModel:"Infinite",
	licenseNumber:"沪BPF980",
	mileage:"5000",
	owner:"Ryan Huang",
	maintainType:"Maintenance",
	phone:"13761202697",
	totalAmount:"1",
	inshopDate:"2017/01/01",
	checkoutDate:"",
	comment:"fix it",
	disableSubmitButton:false
}

var vm = new Vue({
	el:"#content",
	data:viewData,
	methods:{
		submitOrder: function(){
			if(this.validate()){
				console.log(this.licenseNumber);
			}
		},
		
		validate: function(){
			var passed = true;
			if(!this.carModel){
				passed = false;
				return;
			}
			if(!this.licenseNumber){
				passed = false;
				return;
			}
			if(!this.maintainType){
				passed = false;
				return;
			}
			if(!this.totalAmount){
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