(ns net.minecraft.client.renderer.StitcherException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer StitcherException]))

(defn ->stitcher-exception
  "Constructor.

  holder-in - `net.minecraft.client.renderer.texture.Stitcher$Holder`
  message - `java.lang.String`"
  (^StitcherException [^net.minecraft.client.renderer.texture.Stitcher$Holder holder-in ^java.lang.String message]
    (new StitcherException holder-in message)))

