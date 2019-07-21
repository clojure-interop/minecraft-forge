(ns net.minecraft.client.player.inventory.LocalBlockIntercommunication
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.player.inventory LocalBlockIntercommunication]))

(defn ->local-block-intercommunication
  "Constructor.

  gui-id-in - `java.lang.String`
  display-name-in - `net.minecraft.util.text.ITextComponent`"
  (^LocalBlockIntercommunication [^java.lang.String gui-id-in ^net.minecraft.util.text.ITextComponent display-name-in]
    (new LocalBlockIntercommunication gui-id-in display-name-in)))

(defn create-container
  "player-inventory - `net.minecraft.entity.player.InventoryPlayer`
  player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.inventory.Container`"
  (^net.minecraft.inventory.Container [^LocalBlockIntercommunication this ^net.minecraft.entity.player.InventoryPlayer player-inventory ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.createContainer player-inventory player-in))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^LocalBlockIntercommunication this]
    (-> this (.getName))))

(defn has-custom-name?
  "returns: `boolean`"
  (^Boolean [^LocalBlockIntercommunication this]
    (-> this (.hasCustomName))))

(defn get-gui-id
  "returns: `java.lang.String`"
  (^java.lang.String [^LocalBlockIntercommunication this]
    (-> this (.getGuiID))))

(defn get-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^LocalBlockIntercommunication this]
    (-> this (.getDisplayName))))

