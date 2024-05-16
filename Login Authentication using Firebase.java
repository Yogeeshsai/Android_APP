// Firebase authentication initialization
FirebaseAuth mAuth = FirebaseAuth.getInstance();

// Sign in with email and password
mAuth.signInWithEmailAndPassword(email, password)
    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
        @Override
        public void onComplete(@NonNull Task<AuthResult> task) {
            if (task.isSuccessful()) {
                // Login successful
            } else {
                // Login failed
            }
        }
    });
