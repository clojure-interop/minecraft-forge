(ns net.minecraftforge.fml.common.eventhandler.ASMEventHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.eventhandler ASMEventHandler]))

(defn ->asm-event-handler
  "Constructor.

  target - `java.lang.Object`
  method - `java.lang.reflect.Method`
  owner - `net.minecraftforge.fml.common.ModContainer`
  is-generic - `boolean`

  throws: java.lang.Exception"
  (^ASMEventHandler [^java.lang.Object target ^java.lang.reflect.Method method ^net.minecraftforge.fml.common.ModContainer owner ^Boolean is-generic]
    (new ASMEventHandler target method owner is-generic))
  (^ASMEventHandler [^java.lang.Object target ^java.lang.reflect.Method method ^net.minecraftforge.fml.common.ModContainer owner]
    (new ASMEventHandler target method owner)))

(defn invoke
  "event - `net.minecraftforge.fml.common.eventhandler.Event`"
  ([^ASMEventHandler this ^net.minecraftforge.fml.common.eventhandler.Event event]
    (-> this (.invoke event))))

(defn get-priority
  "returns: `net.minecraftforge.fml.common.eventhandler.EventPriority`"
  (^net.minecraftforge.fml.common.eventhandler.EventPriority [^ASMEventHandler this]
    (-> this (.getPriority))))

(defn create-wrapper
  "callback - `java.lang.reflect.Method`

  returns: `java.lang.Class<?>`"
  (^java.lang.Class [^ASMEventHandler this ^java.lang.reflect.Method callback]
    (-> this (.createWrapper callback))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ASMEventHandler this]
    (-> this (.toString))))

