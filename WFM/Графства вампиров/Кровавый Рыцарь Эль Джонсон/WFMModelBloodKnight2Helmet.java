// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelBloodKnight2Helmet extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer head_r1;
	private final ModelRenderer wing_r1;
	private final ModelRenderer wing_r2;
	private final ModelRenderer Head_r2;

	public WFMModelBloodKnight2Helmet() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 9, 8, 0.75F, false));
		Head.cubeList.add(new ModelBox(Head, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 1.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 36, -4.0F, -10.0F, -4.0F, 8, 2, 8, 0.1F, false));

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, -8.3279F, 0.9924F);
		Head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, 0.0F);
		head_r1.cubeList.add(new ModelBox(head_r1, 0, 22, -2.5F, -2.6721F, -3.5F, 5, 2, 5, -0.2F, false));

		wing_r1 = new ModelRenderer(this);
		wing_r1.setRotationPoint(-4.0503F, -4.0F, -3.2929F);
		Head.addChild(wing_r1);
		setRotationAngle(wing_r1, 0.0F, -0.6981F, 0.0F);
		wing_r1.cubeList.add(new ModelBox(wing_r1, 40, 31, 0.0F, -16.0F, 0.0F, 0, 18, 11, 0.0F, false));

		wing_r2 = new ModelRenderer(this);
		wing_r2.setRotationPoint(3.9497F, -4.0F, -3.2929F);
		Head.addChild(wing_r2);
		setRotationAngle(wing_r2, 0.0F, 0.6981F, 0.0F);
		wing_r2.cubeList.add(new ModelBox(wing_r2, 40, 31, 0.0F, -16.0F, 0.0F, 0, 18, 11, 0.0F, false));

		Head_r2 = new ModelRenderer(this);
		Head_r2.setRotationPoint(0.0F, -4.0F, -2.0F);
		Head.addChild(Head_r2);
		setRotationAngle(Head_r2, 0.0F, 0.7854F, 0.0F);
		Head_r2.cubeList.add(new ModelBox(Head_r2, 0, 47, -4.0F, -4.1F, -4.0F, 8, 9, 8, -0.1F, false));
		Head_r2.cubeList.add(new ModelBox(Head_r2, 32, 16, -4.0F, -4.1F, -4.0F, 8, 9, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}