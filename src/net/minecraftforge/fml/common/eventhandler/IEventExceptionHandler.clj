(ns net.minecraftforge.fml.common.eventhandler.IEventExceptionHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.eventhandler IEventExceptionHandler]))

(defn handle-exception
  "Fired when a EventListener throws an exception for the specified event on the event bus.
   After this function returns, the original Throwable will be propagated upwards.

  bus - The bus the event is being fired on - `net.minecraftforge.fml.common.eventhandler.EventBus`
  event - The event that is being fired - `net.minecraftforge.fml.common.eventhandler.Event`
  listeners - All listeners that are listening for this event, in order - `net.minecraftforge.fml.common.eventhandler.IEventListener[]`
  index - Index for the current listener being fired. - `int`
  throwable - The throwable being thrown - `java.lang.Throwable`"
  ([^IEventExceptionHandler this ^net.minecraftforge.fml.common.eventhandler.EventBus bus ^net.minecraftforge.fml.common.eventhandler.Event event listeners ^Integer index ^java.lang.Throwable throwable]
    (-> this (.handleException bus event listeners index throwable))))

