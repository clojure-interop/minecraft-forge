(ns net.minecraftforge.fml.common.eventhandler.ListenerList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.eventhandler ListenerList]))

(defn ->listener-list
  "Constructor.

  parent - `net.minecraftforge.fml.common.eventhandler.ListenerList`"
  (^ListenerList [^net.minecraftforge.fml.common.eventhandler.ListenerList parent]
    (new ListenerList parent))
  (^ListenerList []
    (new ListenerList )))

(defn *resize
  "max - `int`"
  ([^Integer max]
    (ListenerList/resize max)))

(defn *clear-bus-id
  "id - `int`"
  ([^Integer id]
    (ListenerList/clearBusID id)))

(defn *unregister-all
  "id - `int`
  listener - `net.minecraftforge.fml.common.eventhandler.IEventListener`"
  ([^Integer id ^net.minecraftforge.fml.common.eventhandler.IEventListener listener]
    (ListenerList/unregisterAll id listener)))

(defn resize-lists
  "max - `int`"
  ([^ListenerList this ^Integer max]
    (-> this (.resizeLists max))))

(defn get-listeners
  "id - `int`

  returns: `net.minecraftforge.fml.common.eventhandler.IEventListener[]`"
  ([^ListenerList this ^Integer id]
    (-> this (.getListeners id))))

(defn register
  "id - `int`
  priority - `net.minecraftforge.fml.common.eventhandler.EventPriority`
  listener - `net.minecraftforge.fml.common.eventhandler.IEventListener`"
  ([^ListenerList this ^Integer id ^net.minecraftforge.fml.common.eventhandler.EventPriority priority ^net.minecraftforge.fml.common.eventhandler.IEventListener listener]
    (-> this (.register id priority listener))))

(defn unregister
  "id - `int`
  listener - `net.minecraftforge.fml.common.eventhandler.IEventListener`"
  ([^ListenerList this ^Integer id ^net.minecraftforge.fml.common.eventhandler.IEventListener listener]
    (-> this (.unregister id listener))))

