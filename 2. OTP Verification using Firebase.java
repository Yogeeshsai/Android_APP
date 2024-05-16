// Firebase phone auth initialization
PhoneAuthProvider.getInstance().verifyPhoneNumber(
    phoneNumber,        // Phone number to verify
    60,                 // Timeout duration
    TimeUnit.SECONDS,   // Unit of timeout
    this,               // Activity (for callback binding)
    callbacks);         // OnVerificationStateChangedCallbacks
