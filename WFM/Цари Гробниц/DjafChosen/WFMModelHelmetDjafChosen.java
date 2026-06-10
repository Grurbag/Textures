// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelHelmetDjafChosen extends ModelBase {
	private final ModelRenderer helmet;
	private final ModelRenderer helmetOverlay;
	private final ModelRenderer mouth;
	private final ModelRenderer nose;
	private final ModelRenderer ear_left;
	private final ModelRenderer ear_right;
	private final ModelRenderer wing_left;
	private final ModelRenderer wing_right;

	public WFMModelHelmetDjafChosen() {
		textureWidth = 64;
		textureHeight = 64;

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		helmetOverlay = new ModelRenderer(this);
		helmetOverlay.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(helmetOverlay);
		helmetOverlay.cubeList.add(new ModelBox(helmetOverlay, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));

		mouth = new ModelRenderer(this);
		mouth.setRotationPoint(0.0F, -1.5F, -8.0F);
		helmet.addChild(mouth);
		setRotationAngle(mouth, 0.1745F, 0.0F, 0.0F);
		mouth.cubeList.add(new ModelBox(mouth, 0, 16, -2.5F, -2.5F, -3.0F, 5, 5, 7, 0.0F, false));

		nose = new ModelRenderer(this);
		nose.setRotationPoint(0.0F, 2.5F, 2.0F);
		mouth.addChild(nose);
		nose.cubeList.add(new ModelBox(nose, 24, 20, -1.0F, -5.5F, -5.5F, 2, 2, 3, 0.0F, false));

		ear_left = new ModelRenderer(this);
		ear_left.setRotationPoint(4.0F, -11.0F, 1.0F);
		helmet.addChild(ear_left);
		setRotationAngle(ear_left, 0.0F, 0.5236F, 0.0F);
		ear_left.cubeList.add(new ModelBox(ear_left, 56, 16, 0.0F, -7.0F, -2.0F, 0, 11, 4, 0.0F, false));

		ear_right = new ModelRenderer(this);
		ear_right.setRotationPoint(-4.0F, -11.0F, 1.0F);
		helmet.addChild(ear_right);
		setRotationAngle(ear_right, 0.0F, -0.5236F, 0.0F);
		ear_right.cubeList.add(new ModelBox(ear_right, 56, 16, 0.0F, -7.0F, -2.0F, 0, 11, 4, 0.0F, false));

		wing_left = new ModelRenderer(this);
		wing_left.setRotationPoint(5.0F, -5.0F, 6.0F);
		helmet.addChild(wing_left);
		setRotationAngle(wing_left, 0.0F, 0.5236F, 0.0F);
		wing_left.cubeList.add(new ModelBox(wing_left, 48, 30, 0.0F, -7.0F, -2.0F, 0, 12, 8, 0.0F, false));

		wing_right = new ModelRenderer(this);
		wing_right.setRotationPoint(-5.0F, -5.0F, 6.0F);
		helmet.addChild(wing_right);
		setRotationAngle(wing_right, 0.0F, -0.5236F, 0.0F);
		wing_right.cubeList.add(new ModelBox(wing_right, 48, 30, 0.0F, -7.0F, -2.0F, 0, 12, 8, 0.0F, false));
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