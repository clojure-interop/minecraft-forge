(ns net.minecraftforge.common.animation.IEventHandler
  "Handler for animation events;"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.animation IEventHandler]))

(defn handle-events
  "instance - `T`
  time - `float`
  past-events - `java.lang.Iterable`"
  ([^IEventHandler this instance ^Float time ^java.lang.Iterable past-events]
    (-> this (.handleEvents instance time past-events))))

