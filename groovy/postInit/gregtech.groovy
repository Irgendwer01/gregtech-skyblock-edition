mods.gregtech.rock_breaker.removeByInput(960, [item('gregtech:stone_smooth', 1)], null)
mods.gregtech.rock_breaker.removeByInput(960, [item('gregtech:stone_smooth')], null)
mods.gregtech.rock_breaker.removeByInput(240, [item('chisel:basalt')], null)
mods.gregtech.rock_breaker.removeByInput(240, [item('chisel:marble')], null)
mods.gregtech.rock_breaker.removeByInput(60, [item('minecraft:stone', 3)], null)
mods.gregtech.rock_breaker.removeByInput(60, [item('minecraft:stone', 5)], null)
mods.gregtech.rock_breaker.removeByInput(60, [item('minecraft:stone', 1)], null)

mods.gregtech.rock_breaker.recipeBuilder()
  .notConsumable(ore('stoneBasalt'))
  .outputs(item('gregtech:stone_smooth', 3))
  .EUt(7)
  .duration(16)
  .buildAndRegister()
mods.gregtech.rock_breaker.recipeBuilder()
  .notConsumable(ore('stoneMarble'))
  .outputs(item('gregtech:stone_smooth', 2))
  .EUt(7)
  .duration(16)
  .buildAndRegister()
mods.gregtech.rock_breaker.recipeBuilder()
  .notConsumable(ore('stoneGraniteBlack'))
  .outputs(item('gregtech:stone_smooth'))
  .EUt(7)
  .duration(16)
  .buildAndRegister()
mods.gregtech.rock_breaker.recipeBuilder()
  .notConsumable(ore('stoneGraniteRed'))
  .outputs(item('gregtech:stone_smooth', 1))
  .EUt(7)
  .duration(16)
  .buildAndRegister()
mods.gregtech.rock_breaker.recipeBuilder()
  .notConsumable(ore('stoneDiorite'))
  .outputs(item('minecraft:stone', 3))
  .EUt(7)
  .duration(16)
  .buildAndRegister()
mods.gregtech.rock_breaker.recipeBuilder()
  .notConsumable(ore('stoneAndesite'))
  .outputs(item('minecraft:stone', 5))
  .EUt(7)
  .duration(16)
  .buildAndRegister()
mods.gregtech.rock_breaker.recipeBuilder()
  .notConsumable(ore('stoneGranite'))
  .outputs(item('minecraft:stone', 1))
  .EUt(7)
  .duration(16)
  .buildAndRegister()