(ns net.minecraft.client.model.IMultipassModel
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model IMultipassModel]))

(defn render-multipass
  "p-187054-1 - `net.minecraft.entity.Entity`
  p-187054-2 - `float`
  p-187054-3 - `float`
  p-187054-4 - `float`
  p-187054-5 - `float`
  p-187054-6 - `float`
  scale - `float`"
  ([^IMultipassModel this ^net.minecraft.entity.Entity p-187054-1 ^Float p-187054-2 ^Float p-187054-3 ^Float p-187054-4 ^Float p-187054-5 ^Float p-187054-6 ^Float scale]
    (-> this (.renderMultipass p-187054-1 p-187054-2 p-187054-3 p-187054-4 p-187054-5 p-187054-6 scale))))

