(ns net.minecraftforge.client.event.EntityViewRenderEvent$FogDensity
  "Event that allows any feature to customize the fog density the player sees.
  NOTE: In order to make this event have an effect, you must cancel the event"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event EntityViewRenderEvent$FogDensity]))

(defn ->fog-density
  "Constructor.

  renderer - `net.minecraft.client.renderer.EntityRenderer`
  entity - `net.minecraft.entity.Entity`
  state - `net.minecraft.block.state.IBlockState`
  render-partial-ticks - `double`
  density - `float`"
  (^EntityViewRenderEvent$FogDensity [^net.minecraft.client.renderer.EntityRenderer renderer ^net.minecraft.entity.Entity entity ^net.minecraft.block.state.IBlockState state ^Double render-partial-ticks ^Float density]
    (new EntityViewRenderEvent$FogDensity renderer entity state render-partial-ticks density)))

(defn get-density
  "returns: `float`"
  (^Float [^EntityViewRenderEvent$FogDensity this]
    (-> this (.getDensity))))

(defn set-density
  "density - `float`"
  ([^EntityViewRenderEvent$FogDensity this ^Float density]
    (-> this (.setDensity density))))

