(ns net.minecraftforge.fml.client.registry.IRenderFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.registry IRenderFactory]))

(defn create-render-for
  "manager - `net.minecraft.client.renderer.entity.RenderManager`

  returns: `net.minecraft.client.renderer.entity.Render<? super T>`"
  ([^IRenderFactory this ^net.minecraft.client.renderer.entity.RenderManager manager]
    (-> this (.createRenderFor manager))))

