(ns net.minecraft.client.renderer.entity.RenderGiantZombie
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderGiantZombie]))

(defn ->render-giant-zombie
  "Constructor.

  p-i-47206-1 - `net.minecraft.client.renderer.entity.RenderManager`
  p-i-47206-2 - `float`"
  (^RenderGiantZombie [^net.minecraft.client.renderer.entity.RenderManager p-i-47206-1 ^Float p-i-47206-2]
    (new RenderGiantZombie p-i-47206-1 p-i-47206-2)))

(defn transform-held-full-3-d-item-layer
  ""
  ([^RenderGiantZombie this]
    (-> this (.transformHeldFull3DItemLayer))))

