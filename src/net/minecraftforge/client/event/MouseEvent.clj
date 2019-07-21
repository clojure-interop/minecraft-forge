(ns net.minecraftforge.client.event.MouseEvent
  "Author: MachineMuse (Claire Semple)
  Created: 2:46 PM, 9/4/13"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event MouseEvent]))

(defn ->mouse-event
  "Constructor."
  (^MouseEvent []
    (new MouseEvent )))

(defn get-x
  "returns: `int`"
  (^Integer [^MouseEvent this]
    (-> this (.getX))))

(defn get-y
  "returns: `int`"
  (^Integer [^MouseEvent this]
    (-> this (.getY))))

(defn get-dx
  "returns: `int`"
  (^Integer [^MouseEvent this]
    (-> this (.getDx))))

(defn get-dy
  "returns: `int`"
  (^Integer [^MouseEvent this]
    (-> this (.getDy))))

(defn get-dwheel
  "returns: `int`"
  (^Integer [^MouseEvent this]
    (-> this (.getDwheel))))

(defn get-button
  "returns: `int`"
  (^Integer [^MouseEvent this]
    (-> this (.getButton))))

(defn buttonstate?
  "returns: `boolean`"
  (^Boolean [^MouseEvent this]
    (-> this (.isButtonstate))))

(defn get-nanoseconds
  "returns: `long`"
  (^Long [^MouseEvent this]
    (-> this (.getNanoseconds))))

