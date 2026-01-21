package me.trangiahuy.demo;

/**
 * Sample of Enum Class.
 */
public enum ResponseState {
    // Enum classes
    // Simple enums can be single line
    SUCCESS,
    FAILURE,

    // Complex enums with methods
    PROCESSING {
        @Override
        public boolean isFinished() {
            return false;
        }
    };

    /**
     * Checks if the state is finished.
     */
    public boolean isFinished() {
        return true;
    }
}
