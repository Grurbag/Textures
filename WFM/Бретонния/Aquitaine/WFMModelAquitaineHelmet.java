// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelAquitaineHelmet extends ModelBase {
	private final ModelRenderer helmet;
	private final ModelRenderer helmetOverlay;
	private final ModelRenderer horse;
	private final ModelRenderer horse2;
	private final ModelRenderer banner;
	private final ModelRenderer banner2;

	public WFMModelAquitaineHelmet() {
		textureWidth = 64;
		textureHeight = 32;

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		helmetOverlay = new ModelRenderer(this);
		helmetOverlay.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(helmetOverlay);
		helmetOverlay.cubeList.add(new ModelBox(helmetOverlay, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));

		horse = new ModelRenderer(this);
		horse.setRotationPoint(-1.0F, -9.0F, 5.0F);
		helmetOverlay.addChild(horse);
		setRotationAngle(horse, 0.0F, -0.1309F, 0.0F);
		horse.cubeList.add(new ModelBox(horse, 0, 12, -0.1305F, -9.0F, -10.9914F, 0, 10, 10, 0.0F, false));

		horse2 = new ModelRenderer(this);
		horse2.setRotationPoint(1.0F, -9.0F, 5.0F);
		helmetOverlay.addChild(horse2);
		setRotationAngle(horse2, 0.0F, 0.0873F, 0.0F);
		horse2.cubeList.add(new ModelBox(horse2, 0, 12, 0.0872F, -9.0F, -10.9962F, 0, 10, 10, 0.0F, false));

		banner = new ModelRenderer(this);
		banner.setRotationPoint(-2.0F, -8.0F, 0.0F);
		helmetOverlay.addChild(banner);
		setRotationAngle(banner, 0.1745F, -0.1309F, 0.0F);
		banner.cubeList.add(new ModelBox(banner, 48, 16, -1.0F, -8.0F, -1.0F, 0, 8, 8, 0.0F, false));

		banner2 = new ModelRenderer(this);
		banner2.setRotationPoint(4.0F, -8.0F, 0.0F);
		helmetOverlay.addChild(banner2);
		setRotationAngle(banner2, 0.1745F, 0.1309F, 0.0F);
		banner2.cubeList.add(new ModelBox(banner2, 48, 16, -1.0F, -8.0F, -1.0F, 0, 8, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		helmet.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}