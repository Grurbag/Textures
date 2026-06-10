// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelTrollHammerTorpedo extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer body2;
	private final ModelRenderer body3;
	private final ModelRenderer body4;
	private final ModelRenderer torpedo;
	private final ModelRenderer torpedo_wing;
	private final ModelRenderer torpedo_wing2;
	private final ModelRenderer torpedo_wing3;
	private final ModelRenderer torpedo_wing4;
	private final ModelRenderer handle;
	private final ModelRenderer handle2;
	private final ModelRenderer chain;

	public WFMModelTrollHammerTorpedo() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(3.0F, 15.0F, 12.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -7.0F, -8.0F, -11.0F, 8, 8, 8, 0.0F, false));

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(0.0F, 0.0F, -12.0F);
		body.addChild(body2);
		body2.cubeList.add(new ModelBox(body2, 0, 17, -6.0F, -7.0F, -8.0F, 6, 6, 9, 0.0F, false));

		body3 = new ModelRenderer(this);
		body3.setRotationPoint(0.0F, 0.0F, 0.0F);
		body2.addChild(body3);
		body3.cubeList.add(new ModelBox(body3, 0, 32, -6.0F, -7.0F, -8.0F, 6, 6, 8, 0.5F, false));

		body4 = new ModelRenderer(this);
		body4.setRotationPoint(0.0F, 0.0F, -9.0F);
		body2.addChild(body4);
		body4.cubeList.add(new ModelBox(body4, 0, 46, -7.0F, -8.0F, -3.0F, 8, 8, 4, -0.5F, false));

		torpedo = new ModelRenderer(this);
		torpedo.setRotationPoint(0.0F, 0.0F, -3.0F);
		body4.addChild(torpedo);
		torpedo.cubeList.add(new ModelBox(torpedo, 44, 0, -5.5F, -6.5F, -4.0F, 5, 5, 5, -0.5F, false));

		torpedo_wing = new ModelRenderer(this);
		torpedo_wing.setRotationPoint(-3.0F, -7.5F, -3.0F);
		torpedo.addChild(torpedo_wing);
		torpedo_wing.cubeList.add(new ModelBox(torpedo_wing, 48, 3, 0.0F, -2.5F, -4.0F, 0, 6, 8, 0.0F, false));

		torpedo_wing2 = new ModelRenderer(this);
		torpedo_wing2.setRotationPoint(2.0F, -4.5F, -3.0F);
		torpedo.addChild(torpedo_wing2);
		setRotationAngle(torpedo_wing2, 0.0F, 0.0F, 1.5708F);
		torpedo_wing2.cubeList.add(new ModelBox(torpedo_wing2, 48, 3, 0.5F, -1.0F, -4.0F, 0, 6, 8, 0.0F, false));

		torpedo_wing3 = new ModelRenderer(this);
		torpedo_wing3.setRotationPoint(-3.0F, -1.5F, -3.0F);
		torpedo.addChild(torpedo_wing3);
		setRotationAngle(torpedo_wing3, 0.0F, 0.0F, -3.1416F);
		torpedo_wing3.cubeList.add(new ModelBox(torpedo_wing3, 48, 3, 0.0F, -3.5F, -4.0F, 0, 6, 8, 0.0F, false));

		torpedo_wing4 = new ModelRenderer(this);
		torpedo_wing4.setRotationPoint(-6.5F, -4.0F, -3.0F);
		torpedo.addChild(torpedo_wing4);
		setRotationAngle(torpedo_wing4, 0.0F, 0.0F, -1.5708F);
		torpedo_wing4.cubeList.add(new ModelBox(torpedo_wing4, 48, 3, 0.0F, -2.5F, -4.0F, 0, 6, 8, 0.0F, false));

		handle = new ModelRenderer(this);
		handle.setRotationPoint(0.0F, 0.0F, 4.0F);
		body.addChild(handle);
		handle.cubeList.add(new ModelBox(handle, 29, 0, -4.0F, -5.0F, -7.0F, 2, 2, 5, 0.0F, false));

		handle2 = new ModelRenderer(this);
		handle2.setRotationPoint(2.5F, -4.0F, -19.0F);
		body.addChild(handle2);
		handle2.cubeList.add(new ModelBox(handle2, 50, 18, -3.5F, -4.0F, 0.0F, 7, 8, 0, 0.0F, false));

		chain = new ModelRenderer(this);
		chain.setRotationPoint(1.0F, 7.0F, -14.0F);
		body.addChild(chain);
		chain.cubeList.add(new ModelBox(chain, 24, 35, -5.0F, -9.0F, -11.0F, 0, 9, 20, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}