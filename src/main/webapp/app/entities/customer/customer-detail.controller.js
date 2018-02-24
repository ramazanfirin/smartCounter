(function() {
    'use strict';

    angular
        .module('smartCounterApp')
        .controller('CustomerDetailController', CustomerDetailController);

    CustomerDetailController.$inject = ['$scope', '$rootScope', '$stateParams', 'previousState', 'entity', 'Customer'];

    function CustomerDetailController($scope, $rootScope, $stateParams, previousState, entity, Customer) {
        var vm = this;

        vm.customer = entity;
        vm.previousState = previousState.name;

        var unsubscribe = $rootScope.$on('smartCounterApp:customerUpdate', function(event, result) {
            vm.customer = result;
        });
        $scope.$on('$destroy', unsubscribe);
    }
})();
