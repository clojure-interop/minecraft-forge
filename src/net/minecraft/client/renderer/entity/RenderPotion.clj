(ns net.minecraft.client.renderer.entity.RenderPotion
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderPotion]))

(defn ->render-potion
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`
  item-renderer-in - `net.minecraft.client.renderer.RenderItem`"
  (^RenderPotion [^net.minecraft.client.renderer.entity.RenderManager render-manager-in ^net.minecraft.client.renderer.RenderItem item-renderer-in]
    (new RenderPotion render-manager-in item-renderer-in)))

(defn get-stack-to-render
  "entity-in - `net.minecraft.entity.projectile.EntityPotion`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^RenderPotion this ^net.minecraft.entity.projectile.EntityPotion entity-in]
    (-> this (.getStackToRender entity-in))))

