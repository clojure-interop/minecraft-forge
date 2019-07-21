(ns net.minecraft.world.demo.DemoWorldManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.demo DemoWorldManager]))

(defn ->demo-world-manager
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^DemoWorldManager [^net.minecraft.world.World world-in]
    (new DemoWorldManager world-in)))

(defn update-block-removing
  ""
  ([^DemoWorldManager this]
    (-> this (.updateBlockRemoving))))

(defn on-block-clicked
  "pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`"
  ([^DemoWorldManager this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.onBlockClicked pos side))))

(defn block-removing
  "pos - `net.minecraft.util.math.BlockPos`"
  ([^DemoWorldManager this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.blockRemoving pos))))

(defn try-harvest-block
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^DemoWorldManager this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.tryHarvestBlock pos))))

(defn process-right-click
  "player - `net.minecraft.entity.player.EntityPlayer`
  world-in - `net.minecraft.world.World`
  stack - `net.minecraft.item.ItemStack`
  hand - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.EnumActionResult`"
  (^net.minecraft.util.EnumActionResult [^DemoWorldManager this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world-in ^net.minecraft.item.ItemStack stack ^net.minecraft.util.EnumHand hand]
    (-> this (.processRightClick player world-in stack hand))))

(defn process-right-click-block
  "player - `net.minecraft.entity.player.EntityPlayer`
  world-in - `net.minecraft.world.World`
  stack - `net.minecraft.item.ItemStack`
  hand - `net.minecraft.util.EnumHand`
  pos - `net.minecraft.util.math.BlockPos`
  facing - `net.minecraft.util.EnumFacing`
  hit-x - `float`
  hit-y - `float`
  hit-z - `float`

  returns: `net.minecraft.util.EnumActionResult`"
  (^net.minecraft.util.EnumActionResult [^DemoWorldManager this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world-in ^net.minecraft.item.ItemStack stack ^net.minecraft.util.EnumHand hand ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z]
    (-> this (.processRightClickBlock player world-in stack hand pos facing hit-x hit-y hit-z))))

