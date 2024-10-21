map.addListener('click', function(event) {
  var guessedLocation = event.latLng;
  
  // Berechnet die Distanz zwischen dem echten und dem geratenen Ort
  var distance = google.maps.geometry.spherical.computeDistanceBetween(guessedLocation, randomLocation);
  
  // Zeigt die Entfernung in Metern an
  alert('Du bist ' + Math.round(distance) + ' Meter entfernt!');
});
