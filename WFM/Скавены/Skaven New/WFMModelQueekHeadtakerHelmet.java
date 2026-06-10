// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelQueekHeadtakerHelmet extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer jaw_top;
	private final ModelRenderer Greben;
	private final ModelRenderer Greben_r1;
	private final ModelRenderer Greben_r2;

	public WFMModelQueekHeadtakerHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 6.0F, -4.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -3.5F, -6.0F, -7.0F, 7, 6, 6, 0.75F, false));
		head.cubeList.add(new ModelBox(head, 38, 16, -3.5F, -6.0F, -7.0F, 7, 8, 6, 1.0F, false));

		jaw_top = new ModelRenderer(this);
		jaw_top.setRotationPoint(0.0F, -3.6667F, -9.0333F);
		head.addChild(jaw_top);
		setRotationAngle(jaw_top, 0.1745F, 0.0F, 0.0F);
		jaw_top.cubeList.add(new ModelBox(jaw_top, 44, 0, -2.5F, -1.9333F, -2.4667F, 5, 7, 5, 0.75F, false));
		jaw_top.cubeList.add(new ModelBox(jaw_top, 52, 55, 0.0F, -5.0F, -4.0F, 0, 3, 6, 0.0F, false));

		Greben = new ModelRenderer(this);
		Greben.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(Greben);
		Greben.cubeList.add(new ModelBox(Greben, 0, 37, -1.0F, -8.0F, -8.0F, 2, 2, 7, 0.0F, false));
		Greben.cubeList.add(new ModelBox(Greben, 0, 49, -0.5F, -11.0F, -7.0F, 1, 3, 5, 0.0F, false));
		Greben.cubeList.add(new ModelBox(Greben, 0, 61, -0.5F, -11.0F, -2.0F, 1, 1, 2, 0.0F, false));
		Greben.cubeList.add(new ModelBox(Greben, 8, 61, -0.5F, -11.0F, 0.0F, 1, 2, 1, 0.0F, false));
		Greben.cubeList.add(new ModelBox(Greben, 0, 20, -1.0F, -12.0F, -11.0F, 2, 1, 12, 0.0F, false));
		Greben.cubeList.add(new ModelBox(Greben, 38, 18, 0.0F, -17.0F, -12.0F, 0, 5, 12, 0.0F, false));

		Greben_r1 = new ModelRenderer(this);
		Greben_r1.setRotationPoint(1.0F, -7.0F, -10.0F);
		Greben.addChild(Greben_r1);
		setRotationAngle(Greben_r1, 0.0F, 3.1416F, 0.0F);
		Greben_r1.cubeList.add(new ModelBox(Greben_r1, 8, 61, 0.5F, -4.0F, -1.0F, 1, 2, 1, 0.0F, false));

		Greben_r2 = new ModelRenderer(this);
		Greben_r2.setRotationPoint(1.0F, -7.0F, -9.0F);
		Greben.addChild(Greben_r2);
		setRotationAngle(Greben_r2, 0.0F, 3.1416F, 0.0F);
		Greben_r2.cubeList.add(new ModelBox(Greben_r2, 0, 61, 0.5F, -4.0F, -2.0F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}