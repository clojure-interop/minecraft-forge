(ns net.minecraftforge.common.model.animation.IAnimationStateMachine
  "State machine representing the model animation."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.model.animation IAnimationStateMachine]))

(defn apply
  "Sample the state and events at the current time.
   Event iterable will contain all events that happened from the last invocation of this method, from most to least recent.
   Event offset is relative to the previous event, and for the first event it's relative to the current time.

  time - `float`

  returns: `org.apache.commons.lang3.tuple.Pair<net.minecraftforge.common.model.IModelState,java.lang.Iterable<net.minecraftforge.common.animation.Event>>`"
  (^org.apache.commons.lang3.tuple.Pair [^IAnimationStateMachine this ^Float time]
    (-> this (.apply time))))

(defn transition
  "Transition to a new state.

  new-state - `java.lang.String`"
  ([^IAnimationStateMachine this ^java.lang.String new-state]
    (-> this (.transition new-state))))

(defn current-state
  "Get current state name.

  returns: `java.lang.String`"
  (^java.lang.String [^IAnimationStateMachine this]
    (-> this (.currentState))))

(defn should-handle-special-events
  "Set to true if the machine should handle special events that come from the clips (they start with '!').
   Right now only implemented event is \"!transition:\".
   Default value is true.

  value - `boolean`"
  ([^IAnimationStateMachine this ^Boolean value]
    (-> this (.shouldHandleSpecialEvents value))))

