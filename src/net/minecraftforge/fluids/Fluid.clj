(ns net.minecraftforge.fluids.Fluid
  "Minecraft Forge Fluid Implementation

  This class is a fluid (liquid or gas) equivalent to \"Item.\" It describes the nature of a fluid
  and contains its general properties.

  These properties do not have inherent gameplay mechanics - they are provided so that mods may
  choose to take advantage of them.

  Fluid implementations are not required to actively use these properties, nor are objects
  interfacing with fluids required to make use of them, but it is encouraged.

  The default values can be used as a reference point for mods adding fluids such as oil or heavy
  water."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids Fluid]))

(defn ->fluid
  "Constructor.

  fluid-name - `java.lang.String`
  still - `net.minecraft.util.ResourceLocation`
  flowing - `net.minecraft.util.ResourceLocation`"
  (^Fluid [^java.lang.String fluid-name ^net.minecraft.util.ResourceLocation still ^net.minecraft.util.ResourceLocation flowing]
    (new Fluid fluid-name still flowing)))

(def *-bucket-volume
  "Static Constant.

  type: int"
  Fluid/BUCKET_VOLUME)

(defn gaseous?
  "world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^Fluid this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isGaseous world pos)))
  (^Boolean [^Fluid this ^net.minecraftforge.fluids.FluidStack stack]
    (-> this (.isGaseous stack)))
  (^Boolean [^Fluid this]
    (-> this (.isGaseous))))

(defn does-vaporize
  "Determines if this fluid should vaporize in dimensions where water vaporizes when placed.
   To preserve the intentions of vanilla, fluids that can turn lava into obsidian should vaporize.
   This prevents players from making the nether safe with a single bucket.
   Based on ItemBucket.tryPlaceContainedLiquid(EntityPlayer, World, BlockPos)

  fluid-stack - The fluidStack is trying to be placed. - `net.minecraftforge.fluids.FluidStack`

  returns: true if this fluid should vaporize in dimensions where water vaporizes when placed. - `boolean`"
  (^Boolean [^Fluid this ^net.minecraftforge.fluids.FluidStack fluid-stack]
    (-> this (.doesVaporize fluid-stack))))

(defn get-density
  "world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^Fluid this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getDensity world pos)))
  (^Integer [^Fluid this ^net.minecraftforge.fluids.FluidStack stack]
    (-> this (.getDensity stack)))
  (^Integer [^Fluid this]
    (-> this (.getDensity))))

(defn get-unlocalized-name
  "A FluidStack sensitive version of getUnlocalizedName

  stack - `net.minecraftforge.fluids.FluidStack`

  returns: `java.lang.String`"
  (^java.lang.String [^Fluid this ^net.minecraftforge.fluids.FluidStack stack]
    (-> this (.getUnlocalizedName stack)))
  (^java.lang.String [^Fluid this]
    (-> this (.getUnlocalizedName))))

(defn get-empty-sound
  "world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.SoundEvent`"
  (^net.minecraft.util.SoundEvent [^Fluid this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getEmptySound world pos)))
  (^net.minecraft.util.SoundEvent [^Fluid this ^net.minecraftforge.fluids.FluidStack stack]
    (-> this (.getEmptySound stack)))
  (^net.minecraft.util.SoundEvent [^Fluid this]
    (-> this (.getEmptySound))))

(defn get-fill-sound
  "world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.SoundEvent`"
  (^net.minecraft.util.SoundEvent [^Fluid this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getFillSound world pos)))
  (^net.minecraft.util.SoundEvent [^Fluid this ^net.minecraftforge.fluids.FluidStack stack]
    (-> this (.getFillSound stack)))
  (^net.minecraft.util.SoundEvent [^Fluid this]
    (-> this (.getFillSound))))

(defn set-density
  "density - `int`

  returns: `net.minecraftforge.fluids.Fluid`"
  (^net.minecraftforge.fluids.Fluid [^Fluid this ^Integer density]
    (-> this (.setDensity density))))

(defn get-temperature
  "world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^Fluid this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getTemperature world pos)))
  (^Integer [^Fluid this ^net.minecraftforge.fluids.FluidStack stack]
    (-> this (.getTemperature stack)))
  (^Integer [^Fluid this]
    (-> this (.getTemperature))))

(defn set-temperature
  "temperature - `int`

  returns: `net.minecraftforge.fluids.Fluid`"
  (^net.minecraftforge.fluids.Fluid [^Fluid this ^Integer temperature]
    (-> this (.setTemperature temperature))))

(defn set-block
  "block - `net.minecraft.block.Block`

  returns: `net.minecraftforge.fluids.Fluid`"
  (^net.minecraftforge.fluids.Fluid [^Fluid this ^net.minecraft.block.Block block]
    (-> this (.setBlock block))))

(defn get-flowing
  "world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^Fluid this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getFlowing world pos)))
  (^net.minecraft.util.ResourceLocation [^Fluid this ^net.minecraftforge.fluids.FluidStack stack]
    (-> this (.getFlowing stack)))
  (^net.minecraft.util.ResourceLocation [^Fluid this]
    (-> this (.getFlowing))))

(defn get-block
  "returns: `net.minecraft.block.Block`"
  (^net.minecraft.block.Block [^Fluid this]
    (-> this (.getBlock))))

(defn can-be-placed-in-world?
  "returns: `boolean`"
  (^Boolean [^Fluid this]
    (-> this (.canBePlacedInWorld))))

(defn set-empty-sound
  "empty-sound - `net.minecraft.util.SoundEvent`

  returns: `net.minecraftforge.fluids.Fluid`"
  (^net.minecraftforge.fluids.Fluid [^Fluid this ^net.minecraft.util.SoundEvent empty-sound]
    (-> this (.setEmptySound empty-sound))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^Fluid this]
    (-> this (.getName))))

(defn set-luminosity
  "luminosity - `int`

  returns: `net.minecraftforge.fluids.Fluid`"
  (^net.minecraftforge.fluids.Fluid [^Fluid this ^Integer luminosity]
    (-> this (.setLuminosity luminosity))))

(defn set-rarity
  "rarity - `net.minecraft.item.EnumRarity`

  returns: `net.minecraftforge.fluids.Fluid`"
  (^net.minecraftforge.fluids.Fluid [^Fluid this ^net.minecraft.item.EnumRarity rarity]
    (-> this (.setRarity rarity))))

(defn get-localized-name
  "Returns the localized name of this fluid.

  stack - `net.minecraftforge.fluids.FluidStack`

  returns: `java.lang.String`"
  (^java.lang.String [^Fluid this ^net.minecraftforge.fluids.FluidStack stack]
    (-> this (.getLocalizedName stack))))

(defn get-still
  "world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^Fluid this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getStill world pos)))
  (^net.minecraft.util.ResourceLocation [^Fluid this ^net.minecraftforge.fluids.FluidStack stack]
    (-> this (.getStill stack)))
  (^net.minecraft.util.ResourceLocation [^Fluid this]
    (-> this (.getStill))))

(defn get-rarity
  "world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.item.EnumRarity`"
  (^net.minecraft.item.EnumRarity [^Fluid this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getRarity world pos)))
  (^net.minecraft.item.EnumRarity [^Fluid this ^net.minecraftforge.fluids.FluidStack stack]
    (-> this (.getRarity stack)))
  (^net.minecraft.item.EnumRarity [^Fluid this]
    (-> this (.getRarity))))

(defn set-fill-sound
  "fill-sound - `net.minecraft.util.SoundEvent`

  returns: `net.minecraftforge.fluids.Fluid`"
  (^net.minecraftforge.fluids.Fluid [^Fluid this ^net.minecraft.util.SoundEvent fill-sound]
    (-> this (.setFillSound fill-sound))))

(defn set-unlocalized-name
  "unlocalized-name - `java.lang.String`

  returns: `net.minecraftforge.fluids.Fluid`"
  (^net.minecraftforge.fluids.Fluid [^Fluid this ^java.lang.String unlocalized-name]
    (-> this (.setUnlocalizedName unlocalized-name))))

(defn get-color
  "world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^Fluid this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getColor world pos)))
  (^Integer [^Fluid this ^net.minecraftforge.fluids.FluidStack stack]
    (-> this (.getColor stack)))
  (^Integer [^Fluid this]
    (-> this (.getColor))))

(defn set-gaseous
  "is-gaseous - `boolean`

  returns: `net.minecraftforge.fluids.Fluid`"
  (^net.minecraftforge.fluids.Fluid [^Fluid this ^Boolean is-gaseous]
    (-> this (.setGaseous is-gaseous))))

(defn get-viscosity
  "world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^Fluid this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getViscosity world pos)))
  (^Integer [^Fluid this ^net.minecraftforge.fluids.FluidStack stack]
    (-> this (.getViscosity stack)))
  (^Integer [^Fluid this]
    (-> this (.getViscosity))))

(defn vaporize
  "Called instead of placing the fluid block if WorldProvider.doesWaterVaporize() and doesVaporize(FluidStack) are true.
   Override this to make your explosive liquid blow up instead of the default smoke, etc.
   Based on ItemBucket.tryPlaceContainedLiquid(EntityPlayer, World, BlockPos)

  player - Player who tried to place the fluid. May be null for blocks like dispensers. - `net.minecraft.entity.player.EntityPlayer`
  world-in - World to vaporize the fluid in. - `net.minecraft.world.World`
  pos - The position in the world the fluid block was going to be placed. - `net.minecraft.util.math.BlockPos`
  fluid-stack - The fluidStack that was going to be placed. - `net.minecraftforge.fluids.FluidStack`"
  ([^Fluid this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraftforge.fluids.FluidStack fluid-stack]
    (-> this (.vaporize player world-in pos fluid-stack))))

(defn set-viscosity
  "viscosity - `int`

  returns: `net.minecraftforge.fluids.Fluid`"
  (^net.minecraftforge.fluids.Fluid [^Fluid this ^Integer viscosity]
    (-> this (.setViscosity viscosity))))

(defn get-luminosity
  "world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^Fluid this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getLuminosity world pos)))
  (^Integer [^Fluid this ^net.minecraftforge.fluids.FluidStack stack]
    (-> this (.getLuminosity stack)))
  (^Integer [^Fluid this]
    (-> this (.getLuminosity))))

