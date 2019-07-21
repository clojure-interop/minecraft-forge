(ns net.minecraft.client.renderer.entity.RenderSpider
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderSpider]))

(defn ->render-spider
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderSpider [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderSpider render-manager-in)))

