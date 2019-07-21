(ns net.minecraftforge.fml.common.eventhandler.Event
  "Base Event class that all other events are derived from"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.eventhandler Event]))

(defn ->event
  "Constructor."
  (^Event []
    (new Event )))

(defn canceled?
  "Determine if this event is canceled and should stop executing.

  returns: The current canceled state - `boolean`"
  (^Boolean [^Event this]
    (-> this (.isCanceled))))

(defn set-phase
  "value - `net.minecraftforge.fml.common.eventhandler.EventPriority`"
  ([^Event this ^net.minecraftforge.fml.common.eventhandler.EventPriority value]
    (-> this (.setPhase value))))

(defn set-canceled
  "Sets the state of this event, not all events are cancelable, and any attempt to
   cancel a event that can't be will result in a IllegalArgumentException.

   The functionality of setting the canceled state is defined on a per-event bases.

  cancel - The new canceled value - `boolean`"
  ([^Event this ^Boolean cancel]
    (-> this (.setCanceled cancel))))

(defn get-listener-list
  "Returns a ListenerList object that contains all listeners
   that are registered to this event.

  returns: Listener List - `net.minecraftforge.fml.common.eventhandler.ListenerList`"
  (^net.minecraftforge.fml.common.eventhandler.ListenerList [^Event this]
    (-> this (.getListenerList))))

(defn cancelable?
  "Determine if this function is cancelable at all.

  returns: If access to setCanceled should be allowed

   Note:
   Events with the Cancelable annotation will have this method automatically added to return true. - `boolean`"
  (^Boolean [^Event this]
    (-> this (.isCancelable))))

(defn get-phase
  "returns: `net.minecraftforge.fml.common.eventhandler.EventPriority`"
  (^net.minecraftforge.fml.common.eventhandler.EventPriority [^Event this]
    (-> this (.getPhase))))

(defn has-result?
  "Determines if this event expects a significant result value.

   Note:
   Events with the HasResult annotation will have this method automatically added to return true.

  returns: `boolean`"
  (^Boolean [^Event this]
    (-> this (.hasResult))))

(defn set-result
  "Sets the result value for this event, not all events can have a result set, and any attempt to
   set a result for a event that isn't expecting it will result in a IllegalArgumentException.

   The functionality of setting the result is defined on a per-event bases.

  value - The new result - `net.minecraftforge.fml.common.eventhandler.Event$Result`"
  ([^Event this ^net.minecraftforge.fml.common.eventhandler.Event$Result value]
    (-> this (.setResult value))))

(defn get-result
  "Returns the value set as the result of this event

  returns: `net.minecraftforge.fml.common.eventhandler.Event$Result`"
  (^net.minecraftforge.fml.common.eventhandler.Event$Result [^Event this]
    (-> this (.getResult))))

