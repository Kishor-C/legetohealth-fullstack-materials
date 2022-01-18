function validateForm() {
    var form = document.simpleForm;// accesses <form name = 'simpleForm'>
    var user = form.un; // accesses <form name = 'simpleForm'> <input name = 'un'>
    var pass = form.pw; // accesses <form name = 'simpleForm'> <input name = 'pw'>
    if(user.value.length < 1) {
        alert("username can't be empty");
        return false;
    }
    if(pass.value.length < 1) {
        alert("password can't be empty");
        return false;
    }
}