(ns net.minecraft.client.renderer.entity.RenderCaveSpider
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderCaveSpider]))

(defn ->render-cave-spider
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderCaveSpider [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderCaveSpider render-manager-in)))

