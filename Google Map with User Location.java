<!-- Add Google Maps fragment to layout -->
<fragment
    android:id="@+id/map"
    android:name="com.google.android.gms.maps.SupportMapFragment"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
// Set up Google Maps
SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
    .findFragmentById(R.id.map);
mapFragment.getMapAsync(this);

// Mark user location on the map
@Override
public void onMapReady(GoogleMap googleMap) {
    mMap = googleMap;
    // Get user location and mark it on the map
}
