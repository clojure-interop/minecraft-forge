(ns net.minecraftforge.common.ForgeHooks
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common ForgeHooks]))

(defn ->forge-hooks
  "Constructor."
  (^ForgeHooks []
    (new ForgeHooks )))

(defn *on-player-attack-target
  "player - `net.minecraft.entity.player.EntityPlayer`
  target - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.entity.Entity target]
    (ForgeHooks/onPlayerAttackTarget player target)))

(defn *on-player-toss-event
  "player - `net.minecraft.entity.player.EntityPlayer`
  item - `net.minecraft.item.ItemStack`
  include-name - `boolean`

  returns: `net.minecraft.entity.item.EntityItem`"
  (^net.minecraft.entity.item.EntityItem [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack item ^Boolean include-name]
    (ForgeHooks/onPlayerTossEvent player item include-name)))

(defn *on-travel-to-dimension
  "entity - `net.minecraft.entity.Entity`
  dimension - `int`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.Entity entity ^Integer dimension]
    (ForgeHooks/onTravelToDimension entity dimension)))

(defn *on-place-item-into-world
  "itemstack - `net.minecraft.item.ItemStack`
  player - `net.minecraft.entity.player.EntityPlayer`
  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`
  hit-x - `float`
  hit-y - `float`
  hit-z - `float`
  hand - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.EnumActionResult`"
  (^net.minecraft.util.EnumActionResult [^net.minecraft.item.ItemStack itemstack ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side ^Float hit-x ^Float hit-y ^Float hit-z ^net.minecraft.util.EnumHand hand]
    (ForgeHooks/onPlaceItemIntoWorld itemstack player world pos side hit-x hit-y hit-z hand)))

(defn *can-tool-harvest-block?
  "world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.item.ItemStack stack]
    (ForgeHooks/canToolHarvestBlock world pos stack)))

(defn *get-player-visibility-distance
  "player - `net.minecraft.entity.player.EntityPlayer`
  xz-distance - `double`
  max-xz-distance - `double`

  returns: `double`"
  (^Double [^net.minecraft.entity.player.EntityPlayer player ^Double xz-distance ^Double max-xz-distance]
    (ForgeHooks/getPlayerVisibilityDistance player xz-distance max-xz-distance)))

(defn *ray-trace-eye-hit-vec
  "entity - `net.minecraft.entity.EntityLivingBase`
  length - `double`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^net.minecraft.entity.EntityLivingBase entity ^Double length]
    (ForgeHooks/rayTraceEyeHitVec entity length)))

(defn *load-loot-table
  "gson - `com.google.gson.Gson`
  name - `net.minecraft.util.ResourceLocation`
  data - `java.lang.String`
  custom - `boolean`

  returns: `net.minecraft.world.storage.loot.LootTable`"
  (^net.minecraft.world.storage.loot.LootTable [^com.google.gson.Gson gson ^net.minecraft.util.ResourceLocation name ^java.lang.String data ^Boolean custom]
    (ForgeHooks/loadLootTable gson name data custom)))

(defn *on-left-click-block
  "player - `net.minecraft.entity.player.EntityPlayer`
  pos - `net.minecraft.util.math.BlockPos`
  face - `net.minecraft.util.EnumFacing`
  hit-vec - `net.minecraft.util.math.Vec3d`

  returns: `net.minecraftforge.event.entity.player.PlayerInteractEvent$LeftClickBlock`"
  (^net.minecraftforge.event.entity.player.PlayerInteractEvent$LeftClickBlock [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing face ^net.minecraft.util.math.Vec3d hit-vec]
    (ForgeHooks/onLeftClickBlock player pos face hit-vec)))

(defn *default-recipe-get-remaining-items
  "Default implementation of IRecipe.func_179532_b {getRemainingItems} because
   this is just copy pasted over a lot of recipes.

   Another use case for java 8 but sadly we can't use it!

  inv - Crafting inventory - `net.minecraft.inventory.InventoryCrafting`

  returns: Crafting inventory contents after the recipe. - `net.minecraft.util.NonNullList<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.NonNullList [^net.minecraft.inventory.InventoryCrafting inv]
    (ForgeHooks/defaultRecipeGetRemainingItems inv)))

(defn *read-pool-name
  "json - `com.google.gson.JsonObject`

  returns: `java.lang.String`"
  (^java.lang.String [^com.google.gson.JsonObject json]
    (ForgeHooks/readPoolName json)))

(defn *on-empty-click
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`"
  ([^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (ForgeHooks/onEmptyClick player hand)))

(defn *on-living-set-attack-target
  "entity - `net.minecraft.entity.EntityLivingBase`
  target - `net.minecraft.entity.EntityLivingBase`"
  ([^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.entity.EntityLivingBase target]
    (ForgeHooks/onLivingSetAttackTarget entity target)))

(defn *on-crops-grow-pre
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  def - `boolean`

  returns: `boolean`"
  (^Boolean [^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^Boolean def]
    (ForgeHooks/onCropsGrowPre world-in pos state def)))

(defn *get-container-item
  "stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^net.minecraft.item.ItemStack stack]
    (ForgeHooks/getContainerItem stack)))

(defn *on-item-right-click
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (ForgeHooks/onItemRightClick player hand)))

(defn *can-harvest-block?
  "block - `net.minecraft.block.Block`
  player - `net.minecraft.entity.player.EntityPlayer`
  world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^net.minecraft.block.Block block ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (ForgeHooks/canHarvestBlock block player world pos)))

(defn *ray-trace-eyes
  "entity - `net.minecraft.entity.EntityLivingBase`
  length - `double`

  returns: `net.minecraft.util.math.RayTraceResult`"
  (^net.minecraft.util.math.RayTraceResult [^net.minecraft.entity.EntityLivingBase entity ^Double length]
    (ForgeHooks/rayTraceEyes entity length)))

(defn *on-living-jump
  "entity - `net.minecraft.entity.EntityLivingBase`"
  ([^net.minecraft.entity.EntityLivingBase entity]
    (ForgeHooks/onLivingJump entity)))

(defn *tool-effective?
  "world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.item.ItemStack stack]
    (ForgeHooks/isToolEffective world pos stack)))

(defn *on-right-click-block
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`
  pos - `net.minecraft.util.math.BlockPos`
  face - `net.minecraft.util.EnumFacing`
  hit-vec - `net.minecraft.util.math.Vec3d`

  returns: `net.minecraftforge.event.entity.player.PlayerInteractEvent$RightClickBlock`"
  (^net.minecraftforge.event.entity.player.PlayerInteractEvent$RightClickBlock [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing face ^net.minecraft.util.math.Vec3d hit-vec]
    (ForgeHooks/onRightClickBlock player hand pos face hit-vec)))

(defn *on-interact-entity
  "player - `net.minecraft.entity.player.EntityPlayer`
  entity - `net.minecraft.entity.Entity`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.entity.Entity entity ^net.minecraft.util.EnumHand hand]
    (ForgeHooks/onInteractEntity player entity hand)))

(defn *get-grass-seed
  "rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^java.util.Random rand ^Integer fortune]
    (ForgeHooks/getGrassSeed rand fortune)))

(defn *on-living-drops
  "entity - `net.minecraft.entity.EntityLivingBase`
  source - `net.minecraft.util.DamageSource`
  drops - `java.util.ArrayList`
  looting-level - `int`
  recently-hit - `boolean`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.util.DamageSource source ^java.util.ArrayList drops ^Integer looting-level ^Boolean recently-hit]
    (ForgeHooks/onLivingDrops entity source drops looting-level recently-hit)))

(defn *get-crafting-player
  "returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer []
    (ForgeHooks/getCraftingPlayer )))

(defn *living-on-ladder?
  "state - `net.minecraft.block.state.IBlockState`
  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  entity - `net.minecraft.entity.EntityLivingBase`

  returns: `boolean`"
  (^Boolean [^net.minecraft.block.state.IBlockState state ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.entity.EntityLivingBase entity]
    (ForgeHooks/isLivingOnLadder state world pos entity)))

(defn *on-empty-left-click
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^net.minecraft.entity.player.EntityPlayer player]
    (ForgeHooks/onEmptyLeftClick player))
  ([^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack stack]
    (ForgeHooks/onEmptyLeftClick player stack)))

(defn *deserialize-json-loot-entry
  "type - `java.lang.String`
  json - `com.google.gson.JsonObject`
  weight - `int`
  quality - `int`
  conditions - `net.minecraft.world.storage.loot.conditions.LootCondition[]`

  returns: `net.minecraft.world.storage.loot.LootEntry`"
  (^net.minecraft.world.storage.loot.LootEntry [^java.lang.String type ^com.google.gson.JsonObject json ^Integer weight ^Integer quality conditions]
    (ForgeHooks/deserializeJsonLootEntry type json weight quality conditions)))

(defn *get-enchant-power
  "world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `float`"
  (^Float [^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (ForgeHooks/getEnchantPower world pos)))

(defn *on-anvil-change
  "container - `net.minecraft.inventory.ContainerRepair`
  left - `net.minecraft.item.ItemStack`
  right - `net.minecraft.item.ItemStack`
  output-slot - `net.minecraft.inventory.IInventory`
  name - `java.lang.String`
  base-cost - `int`

  returns: `boolean`"
  (^Boolean [^net.minecraft.inventory.ContainerRepair container ^net.minecraft.item.ItemStack left ^net.minecraft.item.ItemStack right ^net.minecraft.inventory.IInventory output-slot ^java.lang.String name ^Integer base-cost]
    (ForgeHooks/onAnvilChange container left right output-slot name base-cost)))

(defn *get-total-armor-value
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `int`"
  (^Integer [^net.minecraft.entity.player.EntityPlayer player]
    (ForgeHooks/getTotalArmorValue player)))

(defn *on-throwable-impact
  "throwable - `net.minecraft.entity.projectile.EntityThrowable`
  ray - `net.minecraft.util.math.RayTraceResult`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.projectile.EntityThrowable throwable ^net.minecraft.util.math.RayTraceResult ray]
    (ForgeHooks/onThrowableImpact throwable ray)))

(defn *on-living-death
  "entity - `net.minecraft.entity.EntityLivingBase`
  src - `net.minecraft.util.DamageSource`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.util.DamageSource src]
    (ForgeHooks/onLivingDeath entity src)))

(defn *on-interact-entity-at
  "player - `net.minecraft.entity.player.EntityPlayer`
  entity - `net.minecraft.entity.Entity`
  ray - `net.minecraft.util.math.RayTraceResult`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.entity.Entity entity ^net.minecraft.util.math.RayTraceResult ray ^net.minecraft.util.EnumHand hand]
    (ForgeHooks/onInteractEntityAt player entity ray hand)))

(defn *read-loot-entry-name
  "json - `com.google.gson.JsonObject`
  type - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^com.google.gson.JsonObject json ^java.lang.String type]
    (ForgeHooks/readLootEntryName json type)))

(defn *on-note-change
  "te - `net.minecraft.tileentity.TileEntityNote`
  old - `byte`

  returns: `boolean`"
  (^Boolean [^net.minecraft.tileentity.TileEntityNote te ^Byte old]
    (ForgeHooks/onNoteChange te old)))

(defn *block-strength
  "state - `net.minecraft.block.state.IBlockState`
  player - `net.minecraft.entity.player.EntityPlayer`
  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `float`"
  (^Float [^net.minecraft.block.state.IBlockState state ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (ForgeHooks/blockStrength state player world pos)))

(defn *inside-of-material?
  "material - `net.minecraft.block.material.Material`
  entity - `net.minecraft.entity.Entity`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^net.minecraft.block.material.Material material ^net.minecraft.entity.Entity entity ^net.minecraft.util.math.BlockPos pos]
    (ForgeHooks/isInsideOfMaterial material entity pos)))

(defn *get-looting-level
  "target - `net.minecraft.entity.Entity`
  killer - `net.minecraft.entity.Entity`
  cause - `net.minecraft.util.DamageSource`

  returns: `int`"
  (^Integer [^net.minecraft.entity.Entity target ^net.minecraft.entity.Entity killer ^net.minecraft.util.DamageSource cause]
    (ForgeHooks/getLootingLevel target killer cause)))

(defn *on-server-chat-event
  "net - `net.minecraft.network.NetHandlerPlayServer`
  raw - `java.lang.String`
  comp - `net.minecraft.util.text.ITextComponent`

  returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^net.minecraft.network.NetHandlerPlayServer net ^java.lang.String raw ^net.minecraft.util.text.ITextComponent comp]
    (ForgeHooks/onServerChatEvent net raw comp)))

(defn *set-crafting-player
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^net.minecraft.entity.player.EntityPlayer player]
    (ForgeHooks/setCraftingPlayer player)))

(defn *get-loot-entry-type
  "entry - `net.minecraft.world.storage.loot.LootEntry`

  returns: `java.lang.String`"
  (^java.lang.String [^net.minecraft.world.storage.loot.LootEntry entry]
    (ForgeHooks/getLootEntryType entry)))

(defn *on-anvil-repair
  "player - `net.minecraft.entity.player.EntityPlayer`
  output - `net.minecraft.item.ItemStack`
  left - `net.minecraft.item.ItemStack`
  right - `net.minecraft.item.ItemStack`

  returns: `float`"
  (^Float [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack output ^net.minecraft.item.ItemStack left ^net.minecraft.item.ItemStack right]
    (ForgeHooks/onAnvilRepair player output left right)))

(defn *new-chat-with-links
  "string - `java.lang.String`
  allow-missing-header - `boolean`

  returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^java.lang.String string ^Boolean allow-missing-header]
    (ForgeHooks/newChatWithLinks string allow-missing-header))
  (^net.minecraft.util.text.ITextComponent [^java.lang.String string]
    (ForgeHooks/newChatWithLinks string)))

(defn *on-living-attack
  "entity - `net.minecraft.entity.EntityLivingBase`
  src - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.util.DamageSource src ^Float amount]
    (ForgeHooks/onLivingAttack entity src amount)))

(defn *on-block-break-event
  "world - `net.minecraft.world.World`
  game-type - `net.minecraft.world.GameType`
  entity-player - `net.minecraft.entity.player.EntityPlayerMP`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^net.minecraft.world.World world ^net.minecraft.world.GameType game-type ^net.minecraft.entity.player.EntityPlayerMP entity-player ^net.minecraft.util.math.BlockPos pos]
    (ForgeHooks/onBlockBreakEvent world game-type entity-player pos)))

(defn *on-living-fall
  "entity - `net.minecraft.entity.EntityLivingBase`
  distance - `float`
  damage-multiplier - `float`

  returns: `float[]`"
  ([^net.minecraft.entity.EntityLivingBase entity ^Float distance ^Float damage-multiplier]
    (ForgeHooks/onLivingFall entity distance damage-multiplier)))

(defn *on-living-hurt
  "entity - `net.minecraft.entity.EntityLivingBase`
  src - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `float`"
  (^Float [^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.util.DamageSource src ^Float amount]
    (ForgeHooks/onLivingHurt entity src amount)))

(defn *on-living-update
  "entity - `net.minecraft.entity.EntityLivingBase`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.EntityLivingBase entity]
    (ForgeHooks/onLivingUpdate entity)))

(defn *on-crops-grow-post
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  block-state - `net.minecraft.block.state.IBlockState`"
  ([^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.block.state.IBlockState block-state]
    (ForgeHooks/onCropsGrowPost world-in pos state block-state)))

(defn *on-pick-block
  "Called when a player uses 'pick block', calls new Entity and Block hooks.

  target - `net.minecraft.util.math.RayTraceResult`
  player - `net.minecraft.entity.player.EntityPlayer`
  world - `net.minecraft.world.World`

  returns: `boolean`"
  (^Boolean [^net.minecraft.util.math.RayTraceResult target ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world]
    (ForgeHooks/onPickBlock target player world)))

