(ns net.minecraftforge.fml.common.registry.GameRegistry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry GameRegistry]))

(defn ->game-registry
  "Constructor."
  (^GameRegistry []
    (new GameRegistry )))

(defn *register-tile-entity-with-alternatives
  "Register a tile entity, with alternative TileEntity identifiers. Use with caution!
   This method allows for you to \"rename\" the 'id' of the tile entity.

  tile-entity-class - The tileEntity class to register - `java.lang.Class`
  id - The primary ID, this will be the ID that the tileentity saves as - `java.lang.String`
  alternatives - A list of alternative IDs that will also map to this class. These will never save, but they will load - `java.lang.String`"
  ([^java.lang.Class tile-entity-class ^java.lang.String id ^java.lang.String alternatives]
    (GameRegistry/registerTileEntityWithAlternatives tile-entity-class id alternatives)))

(defn *get-fuel-value
  "item-stack - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^net.minecraft.item.ItemStack item-stack]
    (GameRegistry/getFuelValue item-stack)))

(defn *register-with-item
  "Deprecated.

  block - The block to register with a registry - `net.minecraft.block.Block`

  returns: The block - `net.minecraft.block.Block`

  throws: java.lang.IllegalArgumentException - if the object is not yet named"
  (^net.minecraft.block.Block [^net.minecraft.block.Block block]
    (GameRegistry/registerWithItem block)))

(defn *add-shaped-recipe
  "output - `net.minecraft.item.ItemStack`
  params - `java.lang.Object`

  returns: `net.minecraft.item.crafting.IRecipe`"
  (^net.minecraft.item.crafting.IRecipe [^net.minecraft.item.ItemStack output ^java.lang.Object params]
    (GameRegistry/addShapedRecipe output params)))

(defn *make-item-stack
  "Makes an ItemStack based on the itemName reference, with supplied meta, stackSize and nbt, if possible

   Will return null if the item doesn't exist (because it's not from a loaded mod for example)
   Will throw a RuntimeException if the nbtString is invalid for use in an ItemStack

  item-name - a registry name reference - `java.lang.String`
  meta - the meta - `int`
  stack-size - the stack size - `int`
  nbt-string - an nbt stack as a string, will be processed by JsonToNBT - `java.lang.String`

  returns: a new itemstack - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^java.lang.String item-name ^Integer meta ^Integer stack-size ^java.lang.String nbt-string]
    (GameRegistry/makeItemStack item-name meta stack-size nbt-string)))

(defn *add-recipe
  "output - `net.minecraft.item.ItemStack`
  params - `java.lang.Object`"
  ([^net.minecraft.item.ItemStack output ^java.lang.Object params]
    (GameRegistry/addRecipe output params))
  ([^net.minecraft.item.crafting.IRecipe recipe]
    (GameRegistry/addRecipe recipe)))

(defn *register-tile-entity
  "tile-entity-class - `java.lang.Class`
  id - `java.lang.String`"
  ([^java.lang.Class tile-entity-class ^java.lang.String id]
    (GameRegistry/registerTileEntity tile-entity-class id)))

(defn *register-fuel-handler
  "handler - `net.minecraftforge.fml.common.IFuelHandler`"
  ([^net.minecraftforge.fml.common.IFuelHandler handler]
    (GameRegistry/registerFuelHandler handler)))

(defn *find-registry
  "Retrieves the registry associated with this super class type.
   If the return is non-null it is HIGHLY recommended that modders cache this
   value as the return will never change for a given type in a single run of Minecraft once set.

  registry-type - The base class of items in this registry. - `java.lang.Class`

  returns: The registry, Null if none is registered. - `<K extends net.minecraftforge.fml.common.registry.IForgeRegistryEntry<K>> net.minecraftforge.fml.common.registry.IForgeRegistry<K>`"
  ([^java.lang.Class registry-type]
    (GameRegistry/findRegistry registry-type)))

(defn *add-smelting
  "input - `net.minecraft.block.Block`
  output - `net.minecraft.item.ItemStack`
  xp - `float`"
  ([^net.minecraft.block.Block input ^net.minecraft.item.ItemStack output ^Float xp]
    (GameRegistry/addSmelting input output xp)))

(defn *register
  "Register the unnamed IForgeRegistry object with the registry system.
   Always make sure you have not previously named the object.

   It is advised that you set the object's registry name and use register(IForgeRegistryEntry) instead.

   Note: That DOES NOT create the ItemBlock for you if this is a Block, you should register that item separately.

  object - The object to register - `K`
  name - The name to register it with - `net.minecraft.util.ResourceLocation`

  returns: The object - `<K extends net.minecraftforge.fml.common.registry.IForgeRegistryEntry<?>> K`

  throws: java.lang.IllegalStateException - if the object already has an existing name (use register(IForgeRegistryEntry) instead)"
  ([object ^net.minecraft.util.ResourceLocation name]
    (GameRegistry/register object name))
  ([object]
    (GameRegistry/register object)))

(defn *add-shapeless-recipe
  "output - `net.minecraft.item.ItemStack`
  params - `java.lang.Object`"
  ([^net.minecraft.item.ItemStack output ^java.lang.Object params]
    (GameRegistry/addShapelessRecipe output params)))

(defn *register-world-generator
  "Register a world generator - something that inserts new block types into the world

  generator - the generator - `net.minecraftforge.fml.common.IWorldGenerator`
  mod-generation-weight - a weight to assign to this generator. Heavy weights tend to sink to the bottom of list of world generators (i.e. they run later) - `int`"
  ([^net.minecraftforge.fml.common.IWorldGenerator generator ^Integer mod-generation-weight]
    (GameRegistry/registerWorldGenerator generator mod-generation-weight)))

(defn *add-substitution-alias
  "Add a forced persistent substitution alias for the block or item to another block or item. This will have
   the effect of using the substituted block or item instead of the original, where ever it is
   referenced.

  name-to-substitute - The name to link to (this is the NEW block or item) - `java.lang.String`
  type - The type (Block or Item) - `net.minecraftforge.fml.common.registry.GameRegistry$Type`
  object - a NEW instance that is type compatible with the existing instance - `java.lang.Object`

  throws: net.minecraftforge.fml.common.registry.ExistingSubstitutionException - if someone else has already registered an alias either from or to one of the names"
  ([^java.lang.String name-to-substitute ^net.minecraftforge.fml.common.registry.GameRegistry$Type type ^java.lang.Object object]
    (GameRegistry/addSubstitutionAlias name-to-substitute type object)))

(defn *generate-world
  "Callback hook for world gen - if your mod wishes to add extra mod related generation to the world
   call this

  chunk-x - Chunk X coordinate - `int`
  chunk-z - Chunk Z coordinate - `int`
  world - World we're generating into - `net.minecraft.world.World`
  chunk-generator - The chunk generator - `net.minecraft.world.chunk.IChunkGenerator`
  chunk-provider - The chunk provider - `net.minecraft.world.chunk.IChunkProvider`"
  ([^Integer chunk-x ^Integer chunk-z ^net.minecraft.world.World world ^net.minecraft.world.chunk.IChunkGenerator chunk-generator ^net.minecraft.world.chunk.IChunkProvider chunk-provider]
    (GameRegistry/generateWorld chunk-x chunk-z world chunk-generator chunk-provider)))

