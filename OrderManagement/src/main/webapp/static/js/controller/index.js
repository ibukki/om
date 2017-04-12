var viewData = {
	carModel:"Infinite",
	licenseNumber:"沪BPF980",
	totalMiles:"5000",
	clientName:"Ryan Huang",
	maintainType:"Maintenance",
	phone:"13761202697",
	totalAmount:"1",
	disableSubmitButton:false
}

var vm = new Vue({
	el:"#content",
	data:viewData,
	methods:{
		submitOrder: function(){
			console.log(this.licenseNumber);
		}
	}
});