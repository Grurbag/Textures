// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelWoodElfLordHelmet extends ModelBase {
	private final ModelRenderer helmet;
	private final ModelRenderer helmetTop;
	private final ModelRenderer horns;
	private final ModelRenderer feathersLeft;
	private final ModelRenderer feathersRight;

	public WFMModelWoodElfLordHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 24.0F, 0.0F);
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		helmetTop = new ModelRenderer(this);
		helmetTop.setRotationPoint(2.0F, -8.0F, 0.0F);
		helmet.addChild(helmetTop);
		helmetTop.cubeList.add(new ModelBox(helmetTop, 32, 8, -8.5F, -14.0F, -4.0F, 13, 14, 0, 0.0F, false));

		horns = new ModelRenderer(this);
		horns.setRotationPoint(0.0F, -3.0F, -3.0F);
		helmet.addChild(horns);
		setRotationAngle(horns, -0.1745F, 0.0F, 0.0F);
		horns.cubeList.add(new ModelBox(horns, 0, 42, -11.5F, -22.0F, -1.0F, 23, 22, 0, 0.0F, false));

		feathersLeft = new ModelRenderer(this);
		feathersLeft.setRotationPoint(5.0F, 0.0F, 0.0F);
		horns.addChild(feathersLeft);
		setRotationAngle(feathersLeft, 0.0F, 2.0071F, 0.0F);
		feathersLeft.cubeList.add(new ModelBox(feathersLeft, 46, 51, -7.0F, -11.0F, -1.0F, 9, 13, 0, 0.0F, false));

		feathersRight = new ModelRenderer(this);
		feathersRight.setRotationPoint(-3.0F, 0.0F, 1.0F);
		horns.addChild(feathersRight);
		setRotationAngle(feathersRight, 0.0F, 1.0908F, 0.0F);
		feathersRight.cubeList.add(new ModelBox(feathersRight, 46, 51, -7.0F, -11.0F, -1.0F, 9, 13, 0, 0.0F, false));
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