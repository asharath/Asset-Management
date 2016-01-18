angular.module('myApp', [])
    .controller('MyCtrl', function($scope, $http) {

        $scope.addUser = function(user) {
            $http.put('/api/user', user).then(function(response) {
	    //refreshAllUsers();
	    alert("New employee added!");
	    window.location.assign("../admin2.html")            
	});
        }
        //function refreshAllUsers() {
          // $http.get('/api/user').then(function(response) {
            //    $scope.users = response.data;
          // });
        //}
    });
