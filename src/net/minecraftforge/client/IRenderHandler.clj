(ns net.minecraftforge.client.IRenderHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client IRenderHandler]))

(defn ->i-render-handler
  "Constructor."
  (^IRenderHandler []
    (new IRenderHandler )))

(defn render
  "partial-ticks - `float`
  world - `net.minecraft.client.multiplayer.WorldClient`
  mc - `net.minecraft.client.Minecraft`"
  ([^IRenderHandler this ^Float partial-ticks ^net.minecraft.client.multiplayer.WorldClient world ^net.minecraft.client.Minecraft mc]
    (-> this (.render partial-ticks world mc))))

