(ns net.minecraft.block.BlockWorkbench$InterfaceCraftingTable
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockWorkbench$InterfaceCraftingTable]))

(defn ->interface-crafting-table
  "Constructor.

  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`"
  (^BlockWorkbench$InterfaceCraftingTable [^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (new BlockWorkbench$InterfaceCraftingTable world-in pos)))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockWorkbench$InterfaceCraftingTable this]
    (-> this (.getName))))

(defn has-custom-name?
  "returns: `boolean`"
  (^Boolean [^BlockWorkbench$InterfaceCraftingTable this]
    (-> this (.hasCustomName))))

(defn get-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^BlockWorkbench$InterfaceCraftingTable this]
    (-> this (.getDisplayName))))

(defn create-container
  "player-inventory - `net.minecraft.entity.player.InventoryPlayer`
  player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.inventory.Container`"
  (^net.minecraft.inventory.Container [^BlockWorkbench$InterfaceCraftingTable this ^net.minecraft.entity.player.InventoryPlayer player-inventory ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.createContainer player-inventory player-in))))

(defn get-gui-id
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockWorkbench$InterfaceCraftingTable this]
    (-> this (.getGuiID))))

