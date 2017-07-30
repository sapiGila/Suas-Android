package zendesk.suas;

import android.support.annotation.NonNull;

/**
 * Interface that gets called before notifying a {@link Listener} or {@link Component}.
 * It can decide if the update will be passed along or not.
 */
public interface Filter<E> {

    /**
     * Decide whether to pass the update to the associated {@link Listener} or {@link Component}
     *
     * @param oldState old state
     * @param newState new state
     * @return {@code true} if the component or listener should be notified, {@link false} if not
     */
    boolean filter(@NonNull E oldState, @NonNull E newState);
}