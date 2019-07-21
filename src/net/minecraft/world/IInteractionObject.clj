(ns net.minecraft.world.IInteractionObject
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world IInteractionObject]))

(defn create-container
  "player-inventory - `net.minecraft.entity.player.InventoryPlayer`
  player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.inventory.Container`"
  (^net.minecraft.inventory.Container [^IInteractionObject this ^net.minecraft.entity.player.InventoryPlayer player-inventory ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.createContainer player-inventory player-in))))

(defn get-gui-id
  "returns: `java.lang.String`"
  (^java.lang.String [^IInteractionObject this]
    (-> this (.getGuiID))))

