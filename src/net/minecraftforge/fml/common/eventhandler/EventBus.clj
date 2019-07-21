(ns net.minecraftforge.fml.common.eventhandler.EventBus
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.eventhandler EventBus]))

(defn ->event-bus
  "Constructor.

  handler - `net.minecraftforge.fml.common.eventhandler.IEventExceptionHandler`"
  (^EventBus [^net.minecraftforge.fml.common.eventhandler.IEventExceptionHandler handler]
    (new EventBus handler))
  (^EventBus []
    (new EventBus )))

(defn register
  "target - `java.lang.Object`"
  ([^EventBus this ^java.lang.Object target]
    (-> this (.register target))))

(defn unregister
  "object - `java.lang.Object`"
  ([^EventBus this ^java.lang.Object object]
    (-> this (.unregister object))))

(defn post
  "event - `net.minecraftforge.fml.common.eventhandler.Event`

  returns: `boolean`"
  (^Boolean [^EventBus this ^net.minecraftforge.fml.common.eventhandler.Event event]
    (-> this (.post event))))

(defn handle-exception
  "Description copied from interface: IEventExceptionHandler

  bus - The bus the event is being fired on - `net.minecraftforge.fml.common.eventhandler.EventBus`
  event - The event that is being fired - `net.minecraftforge.fml.common.eventhandler.Event`
  listeners - All listeners that are listening for this event, in order - `net.minecraftforge.fml.common.eventhandler.IEventListener[]`
  index - Index for the current listener being fired. - `int`
  throwable - The throwable being thrown - `java.lang.Throwable`"
  ([^EventBus this ^net.minecraftforge.fml.common.eventhandler.EventBus bus ^net.minecraftforge.fml.common.eventhandler.Event event listeners ^Integer index ^java.lang.Throwable throwable]
    (-> this (.handleException bus event listeners index throwable))))

