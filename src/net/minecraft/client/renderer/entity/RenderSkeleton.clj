(ns net.minecraft.client.renderer.entity.RenderSkeleton
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderSkeleton]))

(defn ->render-skeleton
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderSkeleton [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderSkeleton render-manager-in)))

(defn transform-held-full-3-d-item-layer
  ""
  ([^RenderSkeleton this]
    (-> this (.transformHeldFull3DItemLayer))))

