(ns net.minecraft.block.BlockAnvil$Anvil
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockAnvil$Anvil]))

(defn ->anvil
  "Constructor.

  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`"
  (^BlockAnvil$Anvil [^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (new BlockAnvil$Anvil world-in pos)))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockAnvil$Anvil this]
    (-> this (.getName))))

(defn has-custom-name?
  "returns: `boolean`"
  (^Boolean [^BlockAnvil$Anvil this]
    (-> this (.hasCustomName))))

(defn get-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^BlockAnvil$Anvil this]
    (-> this (.getDisplayName))))

(defn create-container
  "player-inventory - `net.minecraft.entity.player.InventoryPlayer`
  player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.inventory.Container`"
  (^net.minecraft.inventory.Container [^BlockAnvil$Anvil this ^net.minecraft.entity.player.InventoryPlayer player-inventory ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.createContainer player-inventory player-in))))

(defn get-gui-id
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockAnvil$Anvil this]
    (-> this (.getGuiID))))

