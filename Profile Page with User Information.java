// Retrieve user information from Firebase
FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
if (user != null) {
    String name = user.getDisplayName();
    String email = user.getEmail();
    // Display user information in profile page
}
