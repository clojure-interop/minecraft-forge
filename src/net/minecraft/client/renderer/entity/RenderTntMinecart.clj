(ns net.minecraft.client.renderer.entity.RenderTntMinecart
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderTntMinecart]))

(defn ->render-tnt-minecart
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderTntMinecart [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderTntMinecart render-manager-in)))

