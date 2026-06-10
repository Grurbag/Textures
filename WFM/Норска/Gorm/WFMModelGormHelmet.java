// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelGormHelmet extends ModelBase {
	private final ModelRenderer helmet;
	private final ModelRenderer helmetOverlay;
	private final ModelRenderer beard;
	private final ModelRenderer hornsLeft;
	private final ModelRenderer hornsRight;

	public WFMModelGormHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(3.0F, 24.0F, -3.0F);
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -7.0F, -8.0F, -1.0F, 8, 8, 8, 0.6F, false));

		helmetOverlay = new ModelRenderer(this);
		helmetOverlay.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(helmetOverlay);
		helmetOverlay.cubeList.add(new ModelBox(helmetOverlay, 32, 0, -7.0F, -8.0F, -1.0F, 8, 8, 8, 1.0F, false));

		beard = new ModelRenderer(this);
		beard.setRotationPoint(0.0F, 3.0F, 0.0F);
		helmet.addChild(beard);
		beard.cubeList.add(new ModelBox(beard, 7, 16, -8.0F, -2.4F, -1.6F, 10, 5, 0, 0.0F, false));

		hornsLeft = new ModelRenderer(this);
		hornsLeft.setRotationPoint(2.0F, -3.0F, 1.0F);
		helmet.addChild(hornsLeft);
		setRotationAngle(hornsLeft, -0.6109F, 0.0F, 0.0F);
		hornsLeft.cubeList.add(new ModelBox(hornsLeft, 0, 21, -1.0F, -10.0F, -1.0F, 17, 10, 0, 0.0F, false));

		hornsRight = new ModelRenderer(this);
		hornsRight.setRotationPoint(-19.0F, -3.0F, 1.0F);
		helmet.addChild(hornsRight);
		setRotationAngle(hornsRight, -0.6109F, 0.0F, 0.0F);
		hornsRight.cubeList.add(new ModelBox(hornsRight, 0, 32, -5.0F, -10.0F, -1.0F, 17, 10, 0, 0.0F, false));
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