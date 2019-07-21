(ns net.minecraftforge.client.event.RenderHandEvent
  "This event is fired on MinecraftForge.EVENT_BUS
  before both hands are rendered.
  Canceling this event prevents either hand from being rendered,
  and prevents RenderSpecificHandEvent from firing.
  TODO This may get merged in 11 with RenderSpecificHandEvent to make a generic hand rendering"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderHandEvent]))

(defn ->render-hand-event
  "Constructor.

  context - `net.minecraft.client.renderer.RenderGlobal`
  partial-ticks - `float`
  render-pass - `int`"
  (^RenderHandEvent [^net.minecraft.client.renderer.RenderGlobal context ^Float partial-ticks ^Integer render-pass]
    (new RenderHandEvent context partial-ticks render-pass)))

(defn get-context
  "returns: `net.minecraft.client.renderer.RenderGlobal`"
  (^net.minecraft.client.renderer.RenderGlobal [^RenderHandEvent this]
    (-> this (.getContext))))

(defn get-partial-ticks
  "returns: `float`"
  (^Float [^RenderHandEvent this]
    (-> this (.getPartialTicks))))

(defn get-render-pass
  "returns: `int`"
  (^Integer [^RenderHandEvent this]
    (-> this (.getRenderPass))))

