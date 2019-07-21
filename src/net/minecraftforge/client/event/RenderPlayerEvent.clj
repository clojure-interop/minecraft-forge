(ns net.minecraftforge.client.event.RenderPlayerEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderPlayerEvent]))

(defn ->render-player-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  renderer - `net.minecraft.client.renderer.entity.RenderPlayer`
  partial-render-tick - `float`
  x - `double`
  y - `double`
  z - `double`"
  (^RenderPlayerEvent [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.client.renderer.entity.RenderPlayer renderer ^Float partial-render-tick ^Double x ^Double y ^Double z]
    (new RenderPlayerEvent player renderer partial-render-tick x y z)))

(defn get-renderer
  "returns: `net.minecraft.client.renderer.entity.RenderPlayer`"
  (^net.minecraft.client.renderer.entity.RenderPlayer [^RenderPlayerEvent this]
    (-> this (.getRenderer))))

(defn get-partial-render-tick
  "returns: `float`"
  (^Float [^RenderPlayerEvent this]
    (-> this (.getPartialRenderTick))))

(defn get-x
  "returns: `double`"
  (^Double [^RenderPlayerEvent this]
    (-> this (.getX))))

(defn get-y
  "returns: `double`"
  (^Double [^RenderPlayerEvent this]
    (-> this (.getY))))

(defn get-z
  "returns: `double`"
  (^Double [^RenderPlayerEvent this]
    (-> this (.getZ))))

