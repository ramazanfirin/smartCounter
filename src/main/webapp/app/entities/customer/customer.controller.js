(function() {
    'use strict';

    angular
        .module('smartCounterApp')
        .controller('CustomerController', CustomerController);

    CustomerController.$inject = ['Customer'];

    function CustomerController(Customer) {

        var vm = this;

        vm.customers = [];

        loadAll();

        function loadAll() {
            Customer.query(function(result) {
                vm.customers = result;
                vm.searchQuery = null;
            });
        }
    }
})();
