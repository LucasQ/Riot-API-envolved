var pathArray = window.location.pathname.split('/');

if (pathArray[2] === 'freeweek'){
    document.getElementById('fw').classList.add('nav-item', 'active');
}else {
    document.getElementById('fw').classList.add('nav-item');
}

if (pathArray[2] === 'profile'){
    document.getElementById('prof').classList.add('nav-item', 'active');
}else {
    document.getElementById('prof').classList.add('nav-item');
}

